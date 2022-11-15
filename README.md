# React's BrowserRouter with Spring-Boot

This repo tries to reproduce (and hopefully soon solve) the issues
with using React's BrowserRouter with Spring-Boot:

React redirects to http://localhost:8080/cat but this leads to a 404 in Spring-Boot.

## How to run

```bash
cd frontend
npm run install
npm run build
cp ./build/* ../backend/main/resources/static
cd ../backend
mvn spring-boot:run
```
