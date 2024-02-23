import React, {useState} from 'react';

const Counter = () => {
    // State 관련 hook
    // 동적인 값 상태 : state -> 컴포넌트에서 상태 관리할 수 있음
    const [count,setCount] = useState(0);

    return (
        <div>
            <p>count : {count}</p>
            <button onClick={()=>setCount(count+1)}>+1</button>
            <button onClick={()=>setCount(count-1)}>-1</button>
        </div>
    );
};

export default Counter;