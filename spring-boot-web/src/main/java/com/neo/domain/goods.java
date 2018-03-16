package com.neo.domain;

import lombok.*;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;

/**
 * lombok自动添加getter、setter、构造器、logger、toString等方法
 * 需要在idea插件中安装Lombok插件,然后倒入lombok的jar包
 * @Company
 * @Discription
 * @Author guoxiaojing
 * @CreateDate 2018/3/9 11:18
 * @Version 1.0
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Log4j
@Entity
@Table(name = "goods")
public class goods {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "price")
    private Double price;
    @Column(name = "goods_detail")
    private String goodsDetail;
    @Column(name = "status")
    private Integer status;
}
