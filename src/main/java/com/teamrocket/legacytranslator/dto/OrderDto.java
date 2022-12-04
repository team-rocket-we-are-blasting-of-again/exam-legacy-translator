package com.teamrocket.legacytranslator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {

    private Integer id;
    private Integer order_date;
    private Double total_price;
    private Integer delivered_by;
    private Integer customer_id;
    private Integer restaurant_id;

}
