import React, { Component } from 'react'

export class Clock extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             but:false
        }
    }
    myChangeHandler = () => {
      if(this.state.but)
      {
          this.setState({but:false})
      } 
      else{
        this.setState({but:true})
      }
      
      }

    render() {
       
        
        return (
            <div className="box">
                <h1>Digital Clock</h1>
                <label class="switch">
               <input type="checkbox"  name="but" value="not" onChange={this.myChangeHandler}/>
  <span class="slider round"></span>
</label>

               <Co button={this.state.but}></Co>
            </div>
        )
    }
}
function Co(props){
    const currentdate=new Date();
    const time= currentdate.getHours() + ":" + currentdate.getMinutes() + ":" + currentdate.getSeconds();
    const date=currentdate.getDay() + "/" + currentdate.getMonth()  + "/" + currentdate.getFullYear() ;
    if(props.button)
    {
        return (<div className='dot'>
        <br/>
        <br/>
        <br></br>
         <span className='mid'>{time}<br/>{date}</span>
        </div>)
    }
    else{
        return (<div className='dot'>
        <br/>
        <br/>
        <br></br>
         <span className='mid'>{time}<br/></span>
        </div>)
    }
}

export default Clock
