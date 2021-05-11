import './main.css'
import React from 'react'
import DivTwo from './div2'

class DivOne extends React.Component {
    constructor(props) {
        super(props);

    }


    render() {
        return (
            <div onClick={this.changeIt}>
                <DivTwo />
            </div>
        );
    }
}

export default DivOne;