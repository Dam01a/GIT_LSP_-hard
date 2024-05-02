package org.howard.edu.lsp.oopfinal.question1;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SongsDatabaseTest {
    
    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Jazz", "Always There");
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Country", "Song 2");
        Set<String> countrySongs = db.getSongs("Country");
        assertEquals(2, countrySongs.size());
        assertTrue(countrySongs.contains("Sweet Alabama"));
        assertTrue(countrySongs.contains("Song 2"));
    }

    @Test
    public void testGetSongsNonexistentGenre() {
        SongsDatabase db = new SongsDatabase();
        Set<String> nonexistentSongs = db.getSongs("Nonexistent Genre");
        assertNotNull(nonexistentSongs);
        assertEquals(0, nonexistentSongs.size());
    }

    @Test
    public void testGetGenreOfNonexistentSong() {
        SongsDatabase db = new SongsDatabase();
        assertNull(db.getGenreOfSong("Nonexistent Song"));
    }
}
