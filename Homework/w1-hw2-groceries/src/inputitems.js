import './'
import React, { Component } from 'react'

class InputItems extends Component {
    constructor(props) {
        super(props)
        this.state = {
            item: "",
            units: "",
            quantity: "",
            isPurchased: false
        }
    }

    handleChange = (event) => {
        const { name, value } = event.target
        this.setState({ [name]: value })

    }

    render() {


        return (
            <div>
                <form onSubmit={(event) => this.props.newItemAdd(this.state, event)}>
                    <label> Item <input placeholder="text" value={this.state.newItem} text="text" name="newItem" onChange={this.handleChange} /> </label>
                    <label> Units<input placeholder="text" value={this.state.newUnits} text="text" name="newUnit" onChange={this.handleChange} /> </label>
                    <label> Quantity<input placeholder="text" value={this.state.newQuantity} text="text" name="newQuantity" onChange={this.handleChange} /> </label>
                    <input type="Submit" value="Submit"></input>
                </form>
            </div>
        );

    }
}

export default InputItems;