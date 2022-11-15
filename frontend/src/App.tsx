import React from 'react';
import './App.css';
import {BrowserRouter, Link, Route, Routes} from "react-router-dom";

function App() {
    return <>
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<>Welcome Home</>}/>
                <Route path="cat" element={<>Meow!</>}/>
            </Routes>
            <br/>
            <Link to="/">Go to Home</Link>{' '}
            <Link to="cat">Go to Cat</Link>
        </BrowserRouter>
    </>;
}

export default App;
