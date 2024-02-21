import React, { Component } from 'react';

class ValidationSample extends Component {
    handleButtonClick = () => {
        this.input.focus();

    }
    render() {
        return (
            <div>
                <input type="text" name="pwd" ref={(ref)=>{this.input=ref}}/>
                <button onClick={this.handleButtonClick}>검증하기</button>
            </div>
        );
    }
}

export default ValidationSample;