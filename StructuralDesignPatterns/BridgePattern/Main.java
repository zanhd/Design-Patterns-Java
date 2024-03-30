import AbstractionClassHierarchy.ConcreateViewImplementations.LongFormView;
import AbstractionClassHierarchy.View;
import ImplementationClassHierarchy.ConcreateResourceImplementations.ResourceArtist.Artist;
import ImplementationClassHierarchy.ConcreateResourceImplementations.ResourceArtist.ArtistAdapter;

public class Main {
    public static void main(String[] args) {
        View view = new LongFormView(new ArtistAdapter(new Artist("sample-artist-name")));
        System.out.println(view.show());
    }
}
