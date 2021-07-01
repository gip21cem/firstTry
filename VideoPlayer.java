package com.google;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private final VideoPlaylist videoPlayList;


  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
    this.videoPlayList = new VideoPlaylist();

  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() { videoPlayList.playList();  }

  String current_video = "";

  public void playVideo(String videoId) {
    if(videoLibrary.getVideo(videoId) != null) {
      if(current_video.isEmpty()) {
        current_video = videoLibrary.getVideo(videoId).getTitle();
        System.out.println("Playing video: " + current_video);
      }
      else {
        System.out.println("Stopping video: " + current_video);
        current_video = videoLibrary.getVideo(videoId).getTitle();
        System.out.println("Playing video: " + current_video);
      }
    }
    else
      System.out.println(("Cannot play video: Video does not exist"));
  }

  public void stopVideo() {
    if(current_video.isEmpty()) {
      System.out.println("Cannot stop video. No video is currently playing.");
    }
    else {
      System.out.println("Stopping video: " + current_video);
      current_video = "";
    }
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  String paused_video = "";
  public void pauseVideo() {
    if(current_video.isEmpty()) {
      System.out.println("Cannot pause video. No video is currently playing.");
    }
    else {
      if(paused_video.equals(current_video)) {
        System.out.println(("Video already paused: " + current_video));
      }
      else {
        System.out.println("Pausing video: " + current_video);
        paused_video = current_video;
      }
    }
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}