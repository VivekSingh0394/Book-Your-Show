package com.BMS_backend.BookYourShow.Model;

import com.BMS_backend.BookYourShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theaterSeats")
@Data
@NoArgsConstructor
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    SeatType seatType;
    private int rate;
    @ManyToOne
    @JoinColumn
    private Theater theater;
}
