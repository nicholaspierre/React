import DivOne from './div1.js'
import './main.css'
import React from 'react'

class App extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div onClick={this.changeIt}>
             <DivOne />
            </div>
        );
    }
}

export default App;