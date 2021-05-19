import React from 'react'

class Score extends React.Component {
  constructor(props){
    super(props);
    this.state={
      score:0
    }
  }

  decrement=()=> {
    this.setState({
      score:this.state.score - this.props.quesValue
    });
  }

  increment =()=> {
    this.setState({
      score: this.state.score + this.props.quesValue
    });
  }

  resetScore=() => {
    this.setState({
      score: this.state.score - this.props.quesValue
    });
  }

  resetScore=() => {
    this.setState({
      score: 0
    });
  }

  

  render() {
    return (
      <div className="score">Score: {this.state.score}
        <h2>
            <button id="dec-btn" onClick={this.decrement}>Decrease</button>
            <button id="inc-btn" onClick={this.increment}>Increase</button>
            <button id="reset-btn" onClick={this.resetScore}>Reset</button>
        </h2>
      </div>
    )
  }
}


export default Score;
