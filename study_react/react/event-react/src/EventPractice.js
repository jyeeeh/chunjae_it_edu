import React, { Component } from 'react';

class EventPractice extends Component {
    state ={
        message:'',
        username:''
    }
 /*   
    handleChange =(e) => {
        this.setState({message:e.target.value});
    }
    handleChange1 =(e) => {
        this.setState({username:e.target.value});
    }
*/

    handleChange =(e) => {
        this.setState({[e.target.name]:e.target.value});
    }   
    handleChange1 =(e) => {
        this.setState({[e.target.name]:e.target.value});
    }
    render() {
        return (
            <div>
                <h1>이벤트 연습</h1>
                <input type='text' name='message' placeholder='입력해주세요'
         /*        
         onChange={
            (e) => { 
                    console.log(e.target.name,e.target.value);
                    this.setState({message:e.target.value});
                }
            }  
        */
                onChange={this.handleChange}
                /> <br />
                message : {this.state.message}
                <hr />
                <input type='text' name='username' placeholder='입력해주세요'
                onChange={this.handleChange1}
                /> <br />
                username : {this.state.username}
            </div>
        );
    }
}

export default EventPractice;