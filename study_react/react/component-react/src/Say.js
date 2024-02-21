import React, {useState} from 'react';

const Say = () => {
    // '' < 변수 초기값
    // return 이 2개 받아지므로 배열로 [] 선언
    const [message, setMessage] = useState('')
    
    return (
        // 문자 출력하기
        <div>
            <h1>{message}</h1>
            <button onClick={()=>{
                setMessage('Hi')
            }}>입장</button>

            <button onClick={()=>{
                setMessage('Bye')
            }}>퇴장</button>
        </div>
    );
};

export default Say;