import React from 'react'
import './styles.css'
import Sidebar from './sidebar'
import Reviews from './Reviews'
import Rating from './Rating'
import Analysis from './Analysis'
import WebsiteVisitors from './WebsiteVisitors'


const App = () => {
    return (
        <div className="body">
            <Sidebar />
            <Reviews numbers="100" />
            <Rating numbers="800" />
            <Analysis number1="200" number2="300" number3="400" />
            <WebsiteVisitors numbers="800" />
        </div>
    )
}

export default App