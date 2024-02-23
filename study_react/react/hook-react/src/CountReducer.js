import React, { useReducer } from 'react';

//파라미터값 state, action
//action : 증가, 감소 => object 로 들어와서 object. <<< 로 들어오게 됨 
function reducer(state, action){
    // action의 type
    switch(action.type){
        case 'INC' :
            // state의 count라는걸 관리+1
            return {count:state.count+1};
        case 'DEC' :
            const nextCount = state.count-1;
            // state의 count라는걸 관리-1
            // return {count:state.count-1};
            // 0 미만으로 떨어지지 않게 관리
            return {count:nextCount < 0 ? 0 : nextCount};
        default:
            return state;
        }
}
const CountReducer = () => {
    const [state, dispatch] = useReducer(reducer,{count:0})
    return (
        <div>
            <p> count : {state.count} </p>
            <button onClick={()=>dispatch({type:'INC'})}>+1</button>
            <button onClick={()=>dispatch({type:'DEC'})}>-1</button>
        </div>
    );
};

export default CountReducer;