import React from 'react';
import './TodoTemplate.css';

//ex) <TodoTemplate> "이 안에 있는 내용이 children" </TodoTemplate>
const TodoTemplate = ({children}) => {
    return (
        <div className='TodoTemplate'>
            <div className='app-title'>일정관리</div>
            <div className='content'>{children}</div>
        </div>
    );
};

export default TodoTemplate;