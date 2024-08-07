package com.sunbeam.service;

import com.sunbeam.dto.ReviewDTO;
import com.sunbeam.entities.Review;
import com.sunbeam.repository.ReviewRepository;
import com.sunbeam.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<ReviewDTO> getAllReviews() {
        return reviewRepository.findAll().stream()
                .map(review -> new ReviewDTO(review.getId(), null, null, review.getRating(), review.getComment()))
                .collect(Collectors.toList());
    }

    public ReviewDTO getReviewById(Long id) {
        Review review = reviewRepository.findById(id).orElseThrow(() -> new CustomException("Review not found"));
        return new ReviewDTO(review.getId(), null, null, review.getRating(), review.getComment());
    }

    public ReviewDTO saveReview(ReviewDTO reviewDTO) {
        Review review = new Review(reviewDTO.getId(), null, null, reviewDTO.getRating(), reviewDTO.getComment());
        review = reviewRepository.save(review);
        return new ReviewDTO(review.getId(), null, null, review.getRating(), review.getComment());
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
