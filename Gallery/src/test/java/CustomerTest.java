import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest{

        Customer customer;
        Artwork painting1;
        Artwork painting2;
        Gallery gallery;

        @BeforeEach
        public void setUp(){

                customer = new Customer("Rohaib",500);
                gallery = new Gallery("ArtHere");
                Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
                Artwork painting2 = new Artwork("Starry night", "Van Gogh", 50);
                gallery.addArtwork(painting1);
                gallery.addArtwork(painting2);
        }

        @Test
        public void canGetName(){
                customer = new Customer("Rohaib",500);
                assertThat(customer.getName()).isEqualTo("Rohaib");
        }

        @Test
        public void canGetWallet(){
                customer = new Customer("Rohaib",500);
                customer.addWallet(500);
                assertThat(customer.getWallet()).isEqualTo(500);
        }

        @Test
        public void canSubtractWallet() {
                customer = new Customer("Rohaib",500);
                customer.addWallet(500);
                customer.subtractWallet(100);
                assertThat(customer.getWallet()).isEqualTo(400);
        }

//         @Test
//         //Get Artwork, Subtract Wallet, Add till
//         public void canPayArtwork() {
//                 Artwork painting1 = new Artwork("Mona Lisa", "Da Vinci", 100);
// 
// 
//         }




        }
