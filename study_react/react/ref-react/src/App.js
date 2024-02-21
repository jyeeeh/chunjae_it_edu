import React, { Component } from 'react';
import MoveBox from './MoveBox';

class App extends Component {
  render(){
    return(
    <div>
      <MoveBox ref={(ref) => {this.MoveBox = ref}}/>
      <button onClick={()=> {this.MoveBox.move(100,200)}}>move2</button>
    </div>
  );
  }
};

export default App;