import React, {useEffect, useState} from 'react';

const Info = () => {
    const [name,setName] = useState('');
    // 랜더링 완료 시점 알아보기
    useEffect(
        ()=>{
            // console.log("랜더링 완료");
            // console.log({name});
        },
        [name]
    )

    useEffect(
        ()=>{
            console.log('useEffect',{name});
            return () => {
                //추적하고있는 값 업데이트 직전 값
                console.log('cleanup',{name})
            }
        },
        [name]
    )

    return (
        <div>
          <input type='text' onChange={(e) => setName(e.target.value)} /><br />  
          name : {name}
        </div>
    );
};

export default Info;