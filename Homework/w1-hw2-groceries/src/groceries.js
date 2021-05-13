import React, { Component } from 'react'
import InputItems from './inputitems'
import './index.css'

class Groceries extends Component {
    constructor(props) {
        super(props)
        this.state = {
            grocery: [
                { item: 'banana', units: '5', quantity: 2, isPurchased: false },
                { item: 'eggs', units: '12', quantity: 1, isPurchased: false },
                { item: 'salt', units: '1', quantity: 1, isPurchased: true }
            ],
            isToggleOn: false
        }
        //    this.handlePurchase = this.handlePurchase.bind(this);
    }

    handlePurchase = (item) => {
        // console.log("currentvalue " + item.isPurchased)
        this.setState(state => ({
            isToggleOn: !state.isToggleOn
        }),
            console.log("Value of isToggleOn " + this.state.isToggleOn)
        )
        //        grocery[key].isPurchased: isToggleOn
        //    })
    }

    newItemAdd = (grocerystate, event) => {
        event.preventDefault()
        let newItem = grocerystate.newItem
        let newUnit = grocerystate.newUnit
        let newQuantity = grocerystate.newQuantity
        let isPurchased = false
        let newObj = { item: newItem, units: newUnit, quantity: newQuantity, isPurchased }

        const currentArray = this.state.grocery.slice()
        currentArray.push(newObj)
        this.setState({ grocery: currentArray })

        console.log(currentArray)
    }

    render() {


        return (
            <div>
                {this.state.grocery.map((item, key) => <p value={key}>{item.item}--units:{item.units}
        --quantity:{item.quantity}--isPurchased: {item.isPurchased})
             <button onClick={this.handlePurchase} >Remove</button></p>)}

                <InputItems newItemAdd={this.newItemAdd} />
            </div >
        );
        // {item.isPurchased ? console.log(true) : console.log(false) }
    }
}

export default Groceries;