import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;
    @BeforeEach
    public void setUp(){
        Artist artist1 = new Artist("Da Vinci");

    }
    @Test
    public void canGetName(){
        Artist artist1 = new Artist("Da Vinci");
        assertThat(artist1.getName()).isEqualTo("Da Vinci");
            }

}
