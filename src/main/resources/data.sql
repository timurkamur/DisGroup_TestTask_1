CREATE TABLE IF NOT EXISTS product (
                        id INT PRIMARY KEY,
                        name VARCHAR(255),
                        description VARCHAR(255),
                        cost DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS article (
                         id INT PRIMARY KEY,
                         product_id INT,
                         title VARCHAR(255),
                         content TEXT,
                         created_date TIMESTAMP
);

