create table if not exists clothes (
  id identity,
  name varchar(50) not null,
  created int not null,
  price int not null,
  brand varchar(50) not null,
  created_at timestamp not null
);