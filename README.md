# Binance
This section includes the success responses of various API calls in BINANCE exchange

## Transfer
Success response of transfer API in Binance exchange:
```
{'exchange': 'BINANCE', 'from_balance': {'account_type': 'spot', 'balance_type': 'free', 'item_list': [{'USDT': 48.07561026}], 'vqr_account': 'lalm'}, 'item_list': [{'asset': 'usdt', 'exchange': 'BINANCE', 'from_account_type': 'spot', 'from_vqr_account': 'lalm', 'quantity': 0.01, 'reason': 'accepted', 'strategy': '1225692695', 'symbol': 'ethusdt', 'text': '', 'to_account_type': 'cross_margin', 'to_vqr_account': 'lal1', 'vqr_account': 'lalm'}], 'mb_sequence_number': '1605790818223960450', 'mb_timestamp': '1606239740570753442', 'record_action': 'snapshot', 'record_type': 'transfer', 'to_balance': {'account_type': 'cross_margin', 'balance_type': 'free', 'item_list': [{'USDT': 0.01}], 'vqr_account': 'lal1'}}}
```

## Orders
There are two types of separate responses that fall into this category, namely, submit orders and cancel orders.
The success responses of 'buy' and 'sell' sides of submit_order API in Binance exchange:
### Submit Order
1. side=buy
```
{'account_type': 'spot', 'client_order_id': 5264310041577337662, 'duration': 'gtc', 'exchange': 'BINANCE', 'exchange_order_id': '2102300129', 'executed_quantity': 0, 'limit_price': 150.8, 'market': 'spot', 'open_quantity': 0.07102272727272727, 'order_state': 'active', 'quantity': 0.07102272727272727, 'reason': 'accepted', 'side': 'buy', 'strategy': '1225692695', 'symbol': 'ethusdt', 'text': '', 'type': 'limit', 'vqr_account': 'lalm'} 
```
2. side=sell
```
{'account_type': 'spot', 'client_order_id': 5264310041577337670, 'duration': 'gtc', 'exchange': 'BINANCE', 'exchange_order_id': '2102301804', 'executed_quantity': 0, 'limit_price': 603.2, 'market': 'spot', 'open_quantity': 0.016857720836142953, 'order_state': 'active', 'quantity': 0.016857720836142953, 'reason': 'accepted', 'side': 'sell', 'strategy': '1225692695', 'symbol': 'ethusdt', 'text': '', 'type': 'limit', 'vqr_account': 'lalm'} 
```

### Cancel Order
```
{'account_type': 'spot', 'client_order_id': 5264310041577338357, 'duration': 'gtc', 'exchange': 'BINANCE', 'exchange_order_id': '2102400970', 'executed_quantity': 0, 'limit_price': 150.8, 'market': 'spot', 'open_quantity': 0.07102272727272727, 'order_state': 'dead', 'quantity': 0.07102272727272727, 'reason': 'cancelled', 'side': 'buy', 'strategy': '1225692695', 'symbol': 'ethusdt', 'text': '', 'type': 'limit', 'vqr_account': 'lalm'} 
```

## Loan
Success response of loan API in Binance exchange:
```
{'exchange': 'BINANCE', 'item_list': [{'account_type': 'isolated_margin', 'asset': 'usdt', 'exchange': 'BINANCE', 'exchange_transaction_id': '12344228661', 'quantity': 0.01, 'reason': 'accepted', 'strategy': '219035555', 'symbol': 'ethusdt', 'text': '', 'vqr_account': 'lal1'}], 'mb_sequence_number': '1605790818223956279', 'mb_timestamp': '1606238674443892682', 'record_action': 'snapshot', 'record_type': 'loan'}
```

## Repay
Success response of repay API in Binance exchange:
```
{'exchange': 'BINANCE', 'item_list': [{'account_type': 'isolated_margin', 'asset': 'usdt', 'exchange': 'BINANCE', 'exchange_transaction_id': '12344229762', 'quantity': 0.015, 'reason': 'accepted', 'repaid_quantity': 0.01000038, 'strategy': '219035555', 'symbol': 'ethusdt', 'text': '', 'vqr_account': 'lal1'}], 'mb_sequence_number': '1605790818223956382', 'mb_timestamp': '1606238678066054775', 'record_action': 'snapshot', 'record_type': 'repay'}
```

# Huobi
This section includes the success responses of various API calls in HUOBI exchange

## Transfer
Success response of transfer API in Huobi exchange:
```
{'exchange': 'HUOBI', 'from_balance': {'account_type': 'spot', 'balance_type': 'free', 'item_list': [{'BTC': 1.58002159655e-07}, {'USDT': 0.13001193000005368}, {'ETH': 0.07780358095860783}], 'vqr_account': 'lalm'}, 'item_list': [{'asset': 'usdt', 'exchange': 'HUOBI', 'from_account_type': 'spot', 'from_vqr_account': 'lalm', 'quantity': 0.01, 'reason': 'accepted', 'strategy': '1225692695', 'symbol': 'ethusdt', 'text': '', 'to_account_type': 'isolated_margin', 'to_vqr_account': 'lal1', 'vqr_account': 'lalm'}], 'mb_sequence_number': '1605790818223959390', 'mb_timestamp': '1606239610901423504', 'record_action': 'snapshot', 'record_type': 'transfer', 'to_balance': {'account_type': 'isolated_margin', 'balance_type': 'free', 'item_list': [{'USDT': 0.0}, {'ETH': 0.0}], 'symbol': 'ETHUSDT', 'vqr_account': 'lal1'}}
```

## Orders
There are two types of separate responses that fall into this category, namely, submit orders and cancel orders.
The success responses of 'buy' and 'sell' sides of submit_order API in Huobi exchange:
### Submit Order
1. side=buy
 
2. side=sell
```
{'account_type': 'spot', 'client_order_id': 5264310041577394380, 'duration': 'gtc', 'exchange': 'HUOBI', 'exchange_order_id': '154133347734781', 'executed_quantity': 0, 'limit_price': 603.2, 'market': 'spot', 'open_quantity': 0.008358408559010364, 'order_state': 'active', 'quantity': 0.008358408559010364, 'reason': 'accepted', 'side': 'sell', 'strategy': '1225692695', 'symbol': 'ethusdt', 'text': '', 'type': 'limit', 'vqr_account': 'lalm'}  
```

### Cancel Order

## Loan

## Repay

# Okex
This section includes the success responses of various API calls in OKEX exchange

## Orders
There are three API calls that fall into this category, namely, submit order, cancel order, and cancel all order.
The success responses of 'buy' and 'sell' sides of submit_order API in Okex exchange:
### Submit Order
1. side=buy
```
{'account_type': 'spot', 'client_order_id': 5264310041577936891, 'duration': 'gtc', 'exchange': 'OKEX', 'exchange_order_id': '6035747071549440', 'executed_quantity': 0, 'limit_price': 150.8, 'market': 'spot', 'open_quantity': 0.07102272727272727, 'order_state': 'active', 'quantity': 0.07102272727272727, 'reason': 'accepted', 'side': 'buy', 'strategy': '1225692695', 'symbol': 'ETH-USDT', 'text': '', 'type': 'limit', 'vqr_account': 'lalm'}
```
2. side=sell
 
### Cancel Order
```
{'account_type': 'spot', 'client_order_id': 5264310041578011687, 'duration': 'gtc', 'exchange': 'OKEX', 'exchange_order_id': '6040648467700736', 'executed_quantity': 0, 'limit_price': 150.8, 'market': 'spot', 'open_quantity': 0.07102272727272727, 'order_state': 'dead', 'quantity': 0.07102272727272727, 'reason': 'cancelled', 'side': 'buy', 'strategy': '1225692695', 'symbol': 'ETH-USDT', 'text': '', 'type': 'limit', 'vqr_account': 'lalm'} 
```
