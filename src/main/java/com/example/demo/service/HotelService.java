package com.example.demo.service;

import com.example.demo.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    List<Hotel> getAllHotels();

    Hotel getHotelById(Long id);
}
