package com.BMS_backend.BookYourShow.Model;

import com.BMS_backend.BookYourShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name = "showSeats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   // private int rate;
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    private boolean booked;
    private Date booked_at;// we will set this at the time of booking ticket
    @ManyToOne
    @JoinColumn
    private Ticket ticket;
    @ManyToOne
    @JoinColumn
    private Show show;

}
