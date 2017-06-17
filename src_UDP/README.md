UDPserver:server在閒置未收到封包時，會print出loss目前的loss是多少(假定理論上要收到10000個封包)
		在有收到pkt時會停止列印並開始數收到幾個pkt，一旦pkt傳送完成。server閒置開始未收到pkt就會print出loss
		因此操作version2時，server一run起來不能閒置太久，否則就會print出loss=10000。
