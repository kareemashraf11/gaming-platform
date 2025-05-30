package com.example.FinalPrpject.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BanPayload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    @Enumerated(EnumType.STRING)
    private BanType banType;    // PERMANENT, SHADOW, TEMPORARY
    private String reason;
    private LocalDateTime banDate;
    private int durationInDays; // if(banType==TEMPORARY)

    public BanPayload() {}

    public BanPayload(long userId, BanType banType, String reason, LocalDateTime banDate, int durationInDays) {
        this.userId = userId;
        this.banType = banType;
        this.reason = reason;
        this.banDate = banDate;
        this.durationInDays = durationInDays;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public BanType getBanType() { return banType; }
    public void setBanType(BanType banType) { this.banType = banType; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDateTime getBanDate() { return banDate; }
    public void setBanDate(LocalDateTime banDate) { this.banDate = banDate; }

    public int getDurationInDays() { return durationInDays; }
    public void setDurationInDays(int durationInDays) { this.durationInDays = durationInDays; }

}