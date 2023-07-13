import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArtworkTest {
    Artwork painting1;

    @BeforeEach
    public void setUp(){
            Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
            }
    @Test
    public void canGetTitle(){
        Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
        assertThat(painting1.getTitle()).isEqualTo("Mona Lisa");
        }
           @Test
    public void canGetArtist(){
        Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
        assertThat(painting1.getArtist()).isEqualTo("Da Vinci");
                }
    @Test
    public void canGetPrice(){
        Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
        assertThat(painting1.getPrice()).isEqualTo(100);
             }
}
