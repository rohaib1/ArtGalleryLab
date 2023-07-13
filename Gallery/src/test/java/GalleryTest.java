import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class GalleryTest {
    Gallery gallery;
    Customer customer;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("ArtHere");
        Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
        Artwork painting2 = new Artwork("Starry night", "Van Gogh", 50);
        gallery.addArtwork(painting1);
        gallery.addArtwork(painting2);
//         customer = new Customer("Rohaib",500);
    }

    @Test
    public void galleryHasName(){
        assertThat(gallery.getName()).isEqualTo("ArtHere");
    }
//       @Test
//    public canAddArtwork(){
//        Artwork art = new Artwork("name", "name", 100);
//        gallery.addArtwork(art);
//        assertThat(gallery.getArtwork()).isEqualTo("name");
//        return Artwork<>;
//    }


}
