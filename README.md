# React's BrowserRouter with Spring-Boot

This repo tries to reproduce (and hopefully soon solve) the issues
with using React's BrowserRouter with Spring-Boot:

React redirects to http://localhost:8080/cat but this leads to a 404 in Spring-Boot.

## How to run

```bash
cd frontend
npm run build
cd ../backend
mvn spring-boot:run
```

## Alternative solutions

Please find the alternative solutions in [the branches](https://github.com/bartfastiel/react-browser-router-with-spring-boot/branches) of this repo.
