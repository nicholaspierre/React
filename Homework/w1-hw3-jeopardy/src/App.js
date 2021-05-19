import React, { Component } from 'react'
import Score from './score'
import './App.css';
import logo from './Jeop.jpg';

class App extends Component {
  state = {
    question: "",
    answer: "",
    category: "",
    value: "",
    clues_count: "",
    fetchData: "",
    visible: false
  }

  componentDidMount() {
    this.fetchData();
  }

  fetchData = () => {
    const url = "http://jservice.io/api/random"
    fetch(url, {
      method: "GET",
      dataType: "JSON",
    })
      .then((resp) => {
        return resp.json()
      })
      .then((data) => {
        this.setState({ question: data[0] });
        this.setState({ category: data[0].category.title });
        this.setState({ answer: data[0] });
        this.setState({ value: data[0] });

      })

  }

  render() {
    const buttonText = this.state.visible ? "click here to hide answer for next question" : "click to reveal answer";
    return (
      <div className="Main-App">
        <img src={logo} alt="Logo" />
        <Score quesValue={this.state.value.value} />
        <h3>Lets Play!</h3>
        <div className="questionbutton">
          <button className="getquestion" onClick={this.fetchData}>Get New Question</button>
        </div>
        <div className="title">
          <h3>Category: {this.state.category}</h3>
        </div>
        <div className="question">
          <h3>Question: {this.state.question.question}</h3>
        </div>
        <div className="question-value">
          <h3>Question Value: {this.state.value.value}</h3>
        </div>
        <div className="answer">
          <h2 className="h2ans"> Answer: {this.state.visible ? this.state.answer.answer : null} </h2>
          <button id="ans-btn" onClick={() => {
            this.setState({ visible: !this.state.visible });
          }}>{buttonText}</button>
        </div>
      </div>
    )
  }
}


export default App;
