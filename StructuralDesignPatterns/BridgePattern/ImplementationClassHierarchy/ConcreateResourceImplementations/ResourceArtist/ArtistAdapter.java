package ImplementationClassHierarchy.ConcreateResourceImplementations.ResourceArtist;

import ImplementationClassHierarchy.ConcreateResourceImplementations.ResourceArtist.Artist;
import ImplementationClassHierarchy.Resource;

public class ArtistAdapter implements Resource {
    Artist artist;
    public ArtistAdapter(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return "sample-snippet of artist";
    }

    @Override
    public String title() {
        return artist.getName();
    }

    @Override
    public String image() {
        return "sample-image of artist";
    }

    @Override
    public String url() {
        return "sample-url of artist";
    }
}
