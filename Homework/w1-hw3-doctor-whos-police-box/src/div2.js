import './main.css'
import React from 'react'
import DivThree from './div3.js'

class DivTwo extends React.Component {
    constructor(props) {
        super(props);

    }


    render() {
        return (
            <div>
                <DivThree />
                <DivThree />
            </div>
        );
    }
}

export default DivTwo;