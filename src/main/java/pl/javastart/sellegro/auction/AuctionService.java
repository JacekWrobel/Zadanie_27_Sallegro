package pl.javastart.sellegro.auction;

import org.springframework.stereotype.Service;
import org.springframework.util.comparator.Comparators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class AuctionService {

//
//    public AuctionService() {
//        try {
//            loadData();
//        } catch (IOException e) {
//            System.out.println("Error loading data: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//


/*

    public List<Auction> find4MostExpensive() {
        return auctions.stream()
                .sorted(Comparator.comparing(Auction::getPrice).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Auction> findAllForFilters(AuctionFilters auctionFilters) {
        return auctions.stream()
                .filter(auction -> auctionFilters.getTitle() == null || auction.getTitle().toUpperCase().contains(auctionFilters.getTitle().toUpperCase()))
                .collect(Collectors.toList());
    }

    public List<Auction> findAllSorted(String sort) {
        Comparator<Auction> comparator = Comparator.comparing(Auction::getTitle);
        if (sort.equals("title")) {
            comparator = Comparator.comparing(Auction::getTitle);
        } else if (sort.equals("price")) {
            comparator = Comparator.comparing(Auction::getPrice);
        }

        return auctions.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

 */

}
