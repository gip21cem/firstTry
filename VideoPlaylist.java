package com.google;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/** A class used to represent a Playlist */
class VideoPlaylist {

    private final HashMap<String, Video> videos;

    VideoPlaylist() {
        this.videos = new HashMap<>();
        try {
            File file = new File(this.getClass().getResource("/videos.txt").getFile());

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split("\\|");
                String title = split[0].strip();
                String id = split[1].strip();
                List<String> tags;
                if (split.length > 2) {
                    tags = Arrays.stream(split[2].split(",")).map(String::strip).collect(
                            Collectors.toList());
                } else {
                    tags = new ArrayList<>();
                }
                this.videos.put(id, new Video(title, id, tags));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't find videos.txt");
            ex.printStackTrace();
        }
    }

    /**
     * display all videos in playlist
     */
    void playList() {
        List<Video> myPlayList = new ArrayList<>(this.videos.values());
        Comparator<Video> compareByTitle = (vd1, vd2) -> vd1.getTitle().compareTo(vd2.getTitle());
        Collections.sort(myPlayList, compareByTitle);
        System.out.println("Here is a list of all available videos:");
        for(Video vd : myPlayList) {
            System.out.println("  " + vd.getTitle() + " (" + vd.getVideoId() + ") " + vd.getTags());
        }
    }
}
