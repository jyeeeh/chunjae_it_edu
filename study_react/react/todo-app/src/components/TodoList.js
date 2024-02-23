import React from 'react';
import './TodoList.css';
import TodoListItem from './TodoListItem';

const TodoList = () => {
    return (
        <div children='TodoList'>
            <TodoListItem />
            <TodoListItem />
            <TodoListItem />
        </div>
    );
};

export default TodoList;