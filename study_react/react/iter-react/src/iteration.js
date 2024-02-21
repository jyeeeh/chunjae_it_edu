import React from 'react';

const iteration = () => {
    const names = ['javascript','jQuery','React'];
    const namesList = names.map((name,index)=> <li key={index}>{name}</li>);

    return (
        <div>
            <ul>
                {namesList}
            </ul>
        </div>
    );
};

export default iteration;