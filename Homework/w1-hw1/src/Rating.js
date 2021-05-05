import React from 'react'


const Rating = (props) => {
    return (
        <div className="AvgRating">Average Rating<h3>{props.numbers}</h3></div>
    )
}

export default Rating