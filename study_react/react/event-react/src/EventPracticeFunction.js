import React, {useState} from 'react';

const EventPracticeFunction = () => {
    const [form,setForm] = useState({message:'',username:''});
    const {message,username} = form;
    const handleChange=(e)=>{
        setForm({...form,[e.target.name]:e.target.value})
    }
    return (
        <div>
            <h1>이벤트 연습 - 함수</h1>
            <input type='text' name='message' placeholder='입력해주세요'
             onChange={handleChange}
             /><br />
             message : {message}
             <input type='text' name='message' placeholder='입력해주세요'
             onChange={handleChange}
             /><br />
             username : {username}
        </div>
    );
};

export default EventPracticeFunction;