import './App.css';
import Welcome from './Welcome.js';
import Fail from './Fail';
import { useState } from 'react'

function App() {

  const userLogin = "nick888"
  const password = "global"
  // Current State -- 'SetLogin' & 'setPass' - Function that Updates Current State
  const [login, setLogin] = useState("")
  const [pass, setPass] = useState("")
  const [showLogin, setShowLogin] = useState("")

  const verifyCredentials = (loginObj) => {
    loginObj.preventDefault()
    if (login === userLogin && password === pass) {
      setShowLogin(<Welcome user={login} />)
    } else {
      setShowLogin(<Fail />)
    }
  }

  return (
    <div>
      <form onSubmit={verifyCredentials}>
        <label> Username <input placeholder="text" value={login} text="text" onChange={(loginObj) => setLogin(loginObj.target.value)} /> </label>
        <label> Password <input placeholder="text" value={pass} type="password" onChange={(loginObj) => setPass(loginObj.target.value)} /> </label>
        <input type="Submit" value="Submit"></input>
        <div>{showLogin}</div>
      </form>
    </div>
  );
}

export default App;
