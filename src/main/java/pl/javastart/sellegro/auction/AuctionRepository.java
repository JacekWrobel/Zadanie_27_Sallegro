package pl.javastart.sellegro.auction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuctionRepository extends JpaRepository<Auction, Long> {

    @Query(value = "SELECT * FROM Auction ORDER BY price DESC LIMIT 4", nativeQuery = true)
    List<Auction> bestFourCars();
//
//    List<Auction> findAllOrderByTitle();
//
   @Query("SELECT a FROM Auction a ORDER BY price ASC")
    List<Auction> findAllOrderByPrice();

   @Query("SELECT a FROM Auction a ORDER BY color ASC")
    List<Auction> findAllOrderByColor();

   @Query("SELECT a FROM Auction a ORDER BY endDate DESC ")
    List<Auction> findAllOrderByEndDate();

   @Query("SELECT a FROM Auction a ORDER BY title ASC")
    List<Auction> findAllOrderByTitle();

}
