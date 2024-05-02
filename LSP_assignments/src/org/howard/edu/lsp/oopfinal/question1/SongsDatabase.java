package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        // Get the set of songs for the genre, or create a new set if it doesn't exist
        Set<String> songs = map.getOrDefault(genre, new HashSet<>());
        // Add the new song title to the set
        songs.add(songTitle);
        // Put the updated set back into the map
        map.put(genre, songs);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        // Iterate through each genre and its set of songs
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            // If the set contains the song title, return the genre
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        // If the song title is not found in any genre, return null
        return null;
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        // Return the set of songs for the given genre, or an empty set if the genre doesn't exist
        return map.getOrDefault(genre, new HashSet<>());
    }
}
