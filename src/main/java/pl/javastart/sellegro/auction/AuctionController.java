package pl.javastart.sellegro.auction;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class AuctionController {

    private AuctionRepository auctionRepository;

    public AuctionController(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;

    }


    @GetMapping("/auctions")
    public String auctions(Model model,
                           @RequestParam(required = false, defaultValue = "title") String sort) {
        List<Auction> auctions = new ArrayList<>();
//                        List<Auction> auctions = auctionRepository.findAllOrderByEndDate();
        switch (sort) {
            case "title":
                auctions = auctionRepository.findAllOrderByTitle();
                break;
            case "color":
                auctions = auctionRepository.findAllOrderByColor();
                break;
            case "price":
                auctions = auctionRepository.findAllOrderByPrice();
                break;
            case "endDate":
                auctions = auctionRepository.findAllOrderByEndDate();
                break;

        }

        model.addAttribute("cars", auctions);

        //  model.addAttribute("filters", auctionFilters);
        return "auctions";
    }
}
