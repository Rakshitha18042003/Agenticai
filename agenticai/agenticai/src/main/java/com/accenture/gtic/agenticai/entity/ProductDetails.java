package com.accenture.gtic.agenticai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        private String model;
    }


