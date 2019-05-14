insert into car (id, name, capacity, car_type,img_url_photo, millage) values
(1, 'Fiat Ducato', 2.0, 'VAN', 'https://360view.hum3d.com/zoom/Peugeot/Peugeot_Boxer_Mk2_PassengerVan_2007_1000_0001.jpg', 200000),
(2, 'Citroen Jumper', 2.2, 'VAN','https://40ton.net/wp-content/uploads/2016/06/x-tomi_wirtualny_tuning_dostawczych_13.jpg',300000),
(3, 'Volkswagen Crafter', 3.0, 'VAN','https://swissvans.com/wp-content/uploads/2015/07/vw-crafter-highline-600x394-e1524479933347.jpg', 400000),
(4, 'Peugot 208', 1.2, 'CAR','https://d-mf.ppstatic.pl/art/ao/hp/kx4fy0owg0ss80s8og480/208-van-1.1200.jpg', 80000);

insert into employee (id, first_name, last_name, img_url_photo, active) values
(1, 'Michal', 'Kowalski', 'https://images.pexels.com/photos/2092709/pexels-photo-2092709.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940', true),
(2, 'Adam', 'Nowak', 'https://images.pexels.com/photos/2128807/pexels-photo-2128807.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940', true),
(3, 'Wojtek', 'Kołodziej','https://images.pexels.com/photos/1922144/pexels-photo-1922144.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940', true ),
(4, 'Wojtek', 'Kołodziej','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQs07Ki02zblKkFjUczf9zSJK3-2VgU-_vpuzjl7OK11dWmiiAAA',false ),
(5, 'Wojtek', 'Kołodziej','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqcKvYtCmPIA6RMSjGAKh0wmQ20cdvKzwGBdiCjkfDhszJ2vH-MA',true );

insert into event (id, title, price, location, latitude, longitude, img_url,date) values
(1, 'Impreza dla sony', 300, 'Berlin', 300, 200, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3FS7bHWTF-egU2E1R2ZlsuRpZH9wgEnZcwgnYfCY04fT-8vl0Yg','1994-11-19' ),
(2, 'Impreza dla toyoty', 500, 'Warszawa', 400, 600,  'https://www.cstatic-images.com/car-pictures/xl/USC70SUC043B021001.jpg','2019-11-19');
