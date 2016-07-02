/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f13dev.AlbumCore;

import java.util.*;

/**
 *
 * @author jamesvalentine
 */
public class Artist implements Comparable<Artist> {
    private final String name;
    private Set<Album> albums;
    
    Artist(String aName)
    {
        this.name = aName;
        this.albums = new TreeSet<Album>() {
        };
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the albums
     */
    public Set<Album> getAlbums() {
        return albums;
    }
    
    public void addAlbum(Album anAlbum)
    {
        Set<Album> tempset = this.getAlbums();
        tempset.add(anAlbum);
        this.setAlbums(tempset);
    }

    public void removeAlbum(Album anAlbum)
    {
        Set<Album> tempset = this.getAlbums();
        tempset.remove(anAlbum);
        this.setAlbums(tempset);
    }
            
    /**
     * @param albums the albums to set
     */
    private void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    @Override
    public int compareTo(Artist o) {
        return this.getName().compareTo(o.getName());
    }
}
