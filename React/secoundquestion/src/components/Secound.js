import React from 'react'

function Secound() {
    const employeess=[{Name:"charlie",Job:"Janitor"},{Name:"mac",Job:"Bouncer"},
   {Name:"Dee",Job:"Aspiring actress"},{Name:"Dennis",Job:"Barteder"}]
   
   const a=employeess.map(e=>{return (
     <div>
        <li>{e.Name}<span className="tab">{e.Job}</span></li>
        <hr/>
     </div>
   )})
  return (
    <div >
      <h2>Name<span className="tab">Job</span></h2>
      <hr></hr>
      {a}

    </div>
  );
}

export default Secound
