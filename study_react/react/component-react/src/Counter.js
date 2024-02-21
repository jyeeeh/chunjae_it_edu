import React, { Component } from 'react';

class Counter extends Component {
    state={
        number:0,
        fixNumber:10
    }
    
    render() {
        //object에서 똑같은 변수명
        const {number,fixNumber} = this.state;
        return (
            <div>
                <h1>{number}</h1>
                <h2>{fixNumber}</h2>
                <button onClick={()=>{
                    this.setState({number:number+1})
                }}>+1</button>
            </div>
        );
    }
}

export default Counter;