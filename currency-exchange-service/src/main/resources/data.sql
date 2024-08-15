CREATE TABLE exchange_value (
    id BIGINT NOT NULL PRIMARY KEY,
    currency_from VARCHAR(255),
    currency_to VARCHAR(255),
    conversion_multiple DECIMAL(19, 4),
    port INTEGER
);


insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port)
values(10001, 'USD', 'INR', 65, 0);

insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port)
values(10002, 'EUR', 'INR', 65, 0);

insert into exchange_value(id, currency_from, currency_to, conversion_multiple, port)
values(10003, 'AUD', 'INR', 65, 0);