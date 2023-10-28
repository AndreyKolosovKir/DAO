SELECT o.product_name
FROM netology.orders o
         RIGHT JOIN netology.customers c on c.id = o.customer_id
WHERE LOWER(c.name) = LOWER(:name);